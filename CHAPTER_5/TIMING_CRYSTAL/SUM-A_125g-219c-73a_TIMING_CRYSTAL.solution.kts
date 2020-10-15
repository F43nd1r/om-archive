
solution {
    puzzle = "P042"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -7 to 6
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -7 to 4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = -6
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 3
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -7 to 7
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 2 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                back()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                back()
                forward()
                pivotClockwise()
                back()
                pivotClockwise()
                forward()
                back()
                forward()
                pivotClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
