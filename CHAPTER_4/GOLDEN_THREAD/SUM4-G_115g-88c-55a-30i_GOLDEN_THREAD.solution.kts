
solution {
    puzzle = "P037"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                forward()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
