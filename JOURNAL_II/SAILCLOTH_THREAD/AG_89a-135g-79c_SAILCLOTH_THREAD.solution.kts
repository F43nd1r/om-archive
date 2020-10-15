
solution {
    puzzle = "P061"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 3 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -5
        rotation = 0
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
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
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
