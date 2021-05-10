
solution {
    puzzle = "P042"
    name = "INSTRUCTIONS NO TRACK 11"
    arm(ARM3) {
        number = 1
        position = -1 to -2
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -1 to -3
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 0 to -5
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 3 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                drop()
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
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
