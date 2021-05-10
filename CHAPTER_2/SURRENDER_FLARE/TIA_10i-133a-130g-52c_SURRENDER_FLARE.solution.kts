
solution {
    puzzle = "P022"
    name = "INSTRUCTIONS NO TRACK 17"
    arm(ARM3) {
        number = 1
        position = -3 to -1
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -2 to 5
        rotation = 5
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 2 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -2 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -6 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
