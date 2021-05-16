
solution {
    puzzle = "P027"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -12 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -11 to -1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -9 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -9 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -1
        rotation = 0
    }
    track {
        position = -8 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -11 to -2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        )
    }
}
