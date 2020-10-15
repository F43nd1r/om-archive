
solution {
    puzzle = "P037"
    name = "B CX 6T"
    arm(ARM1) {
        number = 1
        position = 5 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 4 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 6 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 2 to -2
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 4 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 1 to -2, 1 to -1)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 3 to -2, 3 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                forward()
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
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                rotateClockwise()
                wait(1)
                back()
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
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
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
            sequence(4) {
                wait(4)
                grab()
                back()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
