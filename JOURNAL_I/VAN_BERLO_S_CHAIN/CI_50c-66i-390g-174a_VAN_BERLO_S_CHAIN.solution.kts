
solution {
    puzzle = "P055"
    name = "B CI66"
    arm(ARM1) {
        number = 1
        position = 3 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 2
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -1 to 5
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -2 to 5
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 0 to 2
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = 0 to 3
        rotation = 5
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
        position = 3 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 2 to -1, 2 to 0, 1 to 0)
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -1 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 1 to -2, 1 to -3, 0 to -2, -1 to -1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
                drop()
                forward()
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
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
