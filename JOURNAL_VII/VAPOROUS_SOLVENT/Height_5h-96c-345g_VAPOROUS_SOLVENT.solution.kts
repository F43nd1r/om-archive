
solution {
    puzzle = "P098"
    name = "H5"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 0
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 3 to 0
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to 0
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 4 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 10 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = -6
    }
    glyph(PURIFICATION) {
        position = 5 to -1
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 2, 0 to 3, -1 to 3)
    }
    track {
        position = 10 to -4
        positions = listOf(1 to 3, 0 to 3, -1 to 3)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(16)
                grab()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                forward()
                grab()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
