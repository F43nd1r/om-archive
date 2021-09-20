
solution {
    puzzle = "P037"
    name = "B X S 6T"
    arm(ARM6) {
        number = 1
        position = 15 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 12 to 2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 12 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 13 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = 14 to 1
        rotation = -2
    }
    io(INFINITE) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 11 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 15 to 1
        rotation = 0
    }
    track {
        position = 14 to 2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(1)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                back()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
