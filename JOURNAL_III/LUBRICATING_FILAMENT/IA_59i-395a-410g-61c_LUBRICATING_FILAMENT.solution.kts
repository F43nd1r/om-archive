
solution {
    puzzle = "P065"
    name = "B CI59"
    arm(ARM1) {
        number = 1
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 3 to 1
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 5 to -4
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 3 to -1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 3 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -4 to 3
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 4
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 0 to 3
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -1 to -2
        positions = listOf(-3 to 1, -3 to 2, -2 to 2, -2 to 1, -1 to 1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to -1, 0 to 0, -1 to 0, -1 to -1, 0 to -2)
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to 5
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(10)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                extend()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                wait(2)
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(16)
                grab()
                back()
                wait(2)
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
            }
        }
        )
    }
}
