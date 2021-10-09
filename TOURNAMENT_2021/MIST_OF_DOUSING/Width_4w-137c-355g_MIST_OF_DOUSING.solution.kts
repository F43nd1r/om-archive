
solution {
    puzzle = "w2450512021"
    name = "W"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -7 to -6
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -7 to -3
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -7 to -4
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -6 to -8
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -5 to -7
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -5 to -4
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to -6
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -4 to -6
        rotation = -6
    }
    track {
        position = -7 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 1 to 2, 2 to 2, 2 to 3)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                pivotCounterClockwise()
                forward()
                wait(1)
                pivotClockwise()
                extend()
                back()
                pivotClockwise()
                wait(2)
                forward()
                pivotClockwise()
                drop()
                wait(2)
                grab()
                back()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                back()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                back()
                back()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(18)
                grab()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                retract()
                extend()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
