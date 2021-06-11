
solution {
    puzzle = "P085"
    name = "B CI35"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 4
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -1 to 2
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                wait(2)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
