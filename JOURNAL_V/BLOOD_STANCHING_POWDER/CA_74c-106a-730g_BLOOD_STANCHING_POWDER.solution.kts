
solution {
    puzzle = "P087"
    name = "B CA"
    arm(PISTON) {
        number = 1
        position = -3 to 5
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to 6
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 6
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -1 to 4
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 0 to -2
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -3 to 4
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = 1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -2 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -6 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -5 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = -1 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = 0 to -4
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -4 to 3
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -8 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 3
        rotation = 0
    }
    track {
        position = -4 to 5
        positions = listOf(-1 to 0, -1 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = -6 to -1
        positions = listOf(0 to -1, 0 to -2, 1 to -2, 1 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(-2 to -3, -2 to -2, -3 to -2, -3 to -3, -4 to -2)
    }
    track {
        position = 3 to -1
        positions = listOf(-1 to 0, -1 to -1, -1 to -2, -2 to -2, -3 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
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
                rotateClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                extend()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                wait(4)
                back()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(3)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                rotateCounterClockwise()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                forward()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                grab()
                back()
                drop()
                wait(8)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                back()
                wait(3)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                back()
                wait(1)
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                extend()
                rotateCounterClockwise()
                wait(2)
                extend()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
