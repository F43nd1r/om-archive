
solution {
    puzzle = "P025"
    name = "B CGX 2T"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 0
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to -1
        rotation = -1
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -4 to 3
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
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
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
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
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
