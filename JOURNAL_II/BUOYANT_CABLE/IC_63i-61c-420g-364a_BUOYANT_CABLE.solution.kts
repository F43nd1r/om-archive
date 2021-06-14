
solution {
    puzzle = "P062"
    name = "B CI63"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -2 to 4
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -4 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 4
        rotation = 11
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -3 to -7
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -4 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -14
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 2)
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 2, -1 to 3, -2 to 3, -3 to 4, -2 to 4, -3 to 5, -2 to 5, -1 to 4, -1 to 5, -2 to 6, -3 to 7)
    }
    track {
        position = -3 to -8
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -4 to -2
        positions = listOf(1 to -1, 0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                drop()
                wait(5)
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
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
            sequence(9) {
                wait(19)
                grab()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
            }
        }
        )
    }
}
