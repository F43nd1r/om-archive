
solution {
    puzzle = "P106"
    name = "TI"
    arm(ARM1) {
        number = 1
        position = -5 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 3
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -7 to 9
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to 6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 4
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -7 to 4
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -9 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 6
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -5 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
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
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
