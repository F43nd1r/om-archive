
solution {
    puzzle = "P054"
    name = "B AC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 2
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(6)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(10)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(6)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
