
solution {
    puzzle = "P063"
    name = "NEW SOLUTION 3"
    arm(ARM1) {
        number = 1
        position = -13 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -12 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -13 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -13 to -7
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -9 to -5
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -11 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -8
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -11 to -5
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -10 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -8
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -13 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -3
        rotation = 0
    }
    track {
        position = -12 to -8
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                wait(5)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
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
                wait(5)
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
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
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
                drop()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
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
                grab()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
