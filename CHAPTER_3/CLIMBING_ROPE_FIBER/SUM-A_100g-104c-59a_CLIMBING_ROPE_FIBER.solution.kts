
solution {
    puzzle = "P027"
    name = "B S 6T"
    arm(ARM1) {
        number = 1
        position = -2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
