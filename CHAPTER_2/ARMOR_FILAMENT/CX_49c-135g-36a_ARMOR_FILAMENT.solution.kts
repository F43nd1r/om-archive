
solution {
    puzzle = "P020"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -5 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -1 to 2, 0 to 1)
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
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                forward()
                wait(1)
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                wait(1)
                forward()
                forward()
                drop()
            }
        }
        )
    }
}
