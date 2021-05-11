
solution {
    puzzle = "P100"
    name = "NO-TRACK I-9"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = -3
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = 1 to -1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 2
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to 2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -3
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
