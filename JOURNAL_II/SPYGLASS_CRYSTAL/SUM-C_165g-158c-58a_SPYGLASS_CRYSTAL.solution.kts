
solution {
    puzzle = "P063"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to -2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -5
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 0 to -5
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                pivotClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                wait(3)
                forward()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
