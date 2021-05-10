
solution {
    puzzle = "P056"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = 1 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to 0
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 0 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to 1
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 1 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 0 to -3
        positions = listOf(1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                forward()
                drop()
                wait(2)
                back()
            }
        }
        )
    }
}
