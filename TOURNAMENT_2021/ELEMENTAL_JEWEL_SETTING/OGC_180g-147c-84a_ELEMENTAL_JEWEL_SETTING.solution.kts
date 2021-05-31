
solution {
    puzzle = "w2450512809"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -6 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = 0
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 2 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -6 to 4
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 1 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 8
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = -1
    }
    track {
        position = -4 to -2
        positions = listOf(1 to 1, 0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
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
            }
        }
        , 
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
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                forward()
                drop()
                repeat()
                wait(7)
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
