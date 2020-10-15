
solution {
    puzzle = "P030b"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = -1 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to 0
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = -3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to 1
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -5 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -9 to -6
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -9 to -4
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -8 to -7
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -6 to -2
        rotation = -6
    }
    glyph(BONDER) {
        position = -5 to -4
        rotation = -4
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -4
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 1
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -9 to -5
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(-2 to 0, -1 to 0, -1 to 1, 0 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = -9 to -5
        positions = listOf(1 to -2, 2 to -2, 2 to -1, 3 to -1)
    }
    track {
        position = 4 to 3
        positions = listOf(-5 to 0, -6 to 0, -5 to -1, -4 to -2, -4 to -1, -3 to -1, -4 to 0, -5 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                forward()
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                forward()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                back()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
