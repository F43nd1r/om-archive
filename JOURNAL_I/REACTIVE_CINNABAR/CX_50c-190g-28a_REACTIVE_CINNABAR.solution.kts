
solution {
    puzzle = "P056"
    name = "B CX 2T"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to -2
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(-1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
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
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                back()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        )
    }
}
