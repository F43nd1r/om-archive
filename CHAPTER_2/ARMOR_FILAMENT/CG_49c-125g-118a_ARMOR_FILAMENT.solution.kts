
solution {
    puzzle = "P020"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -13 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
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
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                wait(1)
                forward()
                rotateClockwise()
                drop()
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
                rotateCounterClockwise()
                wait(1)
                forward()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
