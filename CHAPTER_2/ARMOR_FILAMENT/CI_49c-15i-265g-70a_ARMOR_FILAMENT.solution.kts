
solution {
    puzzle = "P020"
    name = "B CI15"
    arm(ARM1) {
        number = 1
        position = -14 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -13 to 0
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -14 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -11 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -14 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -12 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -12 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -12 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -14 to 1
        rotation = 0
    }
    track {
        position = -14 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -13 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = -10 to -1
        positions = listOf(11 to 0, 10 to 0, 9 to 1, 9 to 0, 8 to 1, 8 to 0, 7 to 1, 7 to 0, 6 to 1, 6 to 0, 5 to 1, 5 to 0, 4 to 1, 4 to 0, 3 to 1, 3 to 0, 2 to 1, 2 to 0, 1 to 1, 1 to 0, 0 to 1, 0 to 0, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                back()
                back()
            }
        }
        )
    }
}
