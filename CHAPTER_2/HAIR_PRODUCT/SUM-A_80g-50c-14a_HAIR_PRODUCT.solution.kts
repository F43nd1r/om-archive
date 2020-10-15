
solution {
    puzzle = "P016"
    name = "B CGX"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 3
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -1 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
