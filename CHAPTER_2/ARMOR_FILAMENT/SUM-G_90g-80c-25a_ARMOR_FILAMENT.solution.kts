
solution {
    puzzle = "P020"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
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
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(11)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
