
solution {
    puzzle = "P056"
    name = "B CG 2T"
    arm(ARM1) {
        number = 1
        position = -4 to 3
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to 1
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 0 to 2
        positions = listOf(1 to -4, 1 to -3, 1 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        )
    }
}
