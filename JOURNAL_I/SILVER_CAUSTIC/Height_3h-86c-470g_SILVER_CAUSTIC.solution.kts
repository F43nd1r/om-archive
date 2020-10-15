
solution {
    puzzle = "P057"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -9 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -3 to -2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -10 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -11 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -8 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 2 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 2 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 7 to -1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 6 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to -1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -7 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -2 to -2
        rotation = 0
    }
    track {
        position = 4 to -2
        positions = listOf(5 to 0, 4 to 0, 3 to 1, 2 to 1, 1 to 1, 1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -9 to -1
        positions = listOf(3 to 1, 2 to 1, 1 to 1, 0 to 1, -1 to 1, -1 to 0, -1 to -1, -2 to 0)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -1 to 0)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -2 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                grab()
                forward()
                drop()
                forward()
                wait(1)
                grab()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                wait(1)
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                back()
                back()
                wait(5)
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                back()
                grab()
                forward()
                forward()
                wait(3)
                back()
                wait(2)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(2)
                forward()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                back()
                back()
                wait(1)
                forward()
                forward()
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
