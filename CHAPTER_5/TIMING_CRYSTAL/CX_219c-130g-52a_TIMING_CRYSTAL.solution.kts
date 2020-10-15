
solution {
    puzzle = "P042"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(5)
                pivotClockwise()
                wait(5)
                pivotClockwise()
                wait(5)
                pivotClockwise()
                wait(5)
                pivotClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
