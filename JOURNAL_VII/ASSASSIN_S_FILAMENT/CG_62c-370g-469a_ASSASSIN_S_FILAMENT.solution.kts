
solution {
    puzzle = "P097"
    name = "B CGX"
    arm(ARM1) {
        number = 1
        position = 3 to -4
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 7 to -5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 11 to -9
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 11 to -11
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 12 to -12
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 9 to -5
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 7 to -8
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 9 to -8
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 9 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -5
        rotation = 0
    }
    track {
        position = 9 to -10
        positions = listOf(2 to 2, 2 to 1, 2 to 0, 2 to -1, 3 to -2, 3 to -1)
    }
    track {
        position = 9 to -4
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 0 to -3
        positions = listOf(-2 to 2, -2 to 1, -1 to 1, -1 to 2, -1 to 3, -1 to 4)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateClockwise()
                wait(2)
                pivotClockwise()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                reset()
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
                grab()
                forward()
                pivotClockwise()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        )
    }
}
