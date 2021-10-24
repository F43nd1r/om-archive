
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -7 to 12
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -6 to 11
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 1 to 6
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 9 to 6
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to 4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -8 to 13
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to 5
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to 7
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 8 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 13
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to 12
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 11 to 6
        rotation = 0
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
                wait(4)
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
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                extend()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
