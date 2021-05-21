
solution {
    puzzle = "P106"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM1) {
        number = 1
        position = -3 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to 1
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -6
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 4 to -7
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 7 to -3
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -11
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -11
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 7 to -6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 9 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -6 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -3
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
