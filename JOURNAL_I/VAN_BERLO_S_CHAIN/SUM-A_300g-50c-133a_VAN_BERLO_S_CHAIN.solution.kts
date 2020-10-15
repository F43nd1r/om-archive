
solution {
    puzzle = "P055"
    name = "B CGX 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 4 to -4
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    track {
        position = -1 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 2 to -1, 2 to 0, 1 to 0)
    }
    track {
        position = 4 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
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
            sequence(5) {
                grab()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
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
            sequence(7) {
                wait(2)
                grab()
                forward()
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
                grab()
                forward()
                forward()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
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
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
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
        )
    }
}
