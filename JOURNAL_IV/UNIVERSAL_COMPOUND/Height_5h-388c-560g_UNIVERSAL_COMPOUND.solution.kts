
solution {
    puzzle = "P072"
    name = "H5"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to 2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -4 to -1
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -5 to 0
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -7 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -5 to -1
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -3 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to 0
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -8 to 3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -10 to -1
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = -8 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = -10 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -12 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -11 to 1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -4 to 1
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = -6 to 2
        rotation = -4
    }
    glyph(UNIFICATION) {
        position = -1 to 0
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -15 to 1
        rotation = -6
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(-1 to 1, -1 to 0, 0 to 0)
    }
    track {
        position = -9 to 3
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, 0 to 0, 1 to 0)
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -6 to 0
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, 0 to 0, -1 to 1, 0 to 1, 1 to 0)
    }
    track {
        position = -10 to -1
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0, 7 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                wait(1)
                forward()
                rotateClockwise()
                back()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                back()
                extend()
                drop()
                wait(1)
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                grab()
                back()
                wait(2)
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                back()
                drop()
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(22)
                grab()
                rotateClockwise()
                extend()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                retract()
                forward()
                wait(3)
                back()
                drop()
                wait(1)
                forward()
                forward()
                rotateClockwise()
                wait(3)
                grab()
                back()
                back()
                drop()
                wait(2)
                grab()
                back()
                back()
                extend()
                extend()
                wait(12)
                retract()
                retract()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                extend()
                back()
                drop()
                forward()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(15)
                forward()
                wait(1)
                back()
                wait(1)
                forward()
                wait(6)
                grab()
                back()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                extend()
                back()
                drop()
                rotateClockwise()
                wait(2)
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                rotateCounterClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(11)
                grab()
                back()
                wait(3)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                retract()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                back()
                back()
                rotateClockwise()
                extend()
                extend()
                wait(2)
                grab()
                retract()
                retract()
                wait(2)
                rotateCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(48)
                grab()
                retract()
                extend()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(3)
                forward()
                grab()
                extend()
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(7)
                rotateClockwise()
                rotateClockwise()
                wait(7)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(19)
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                back()
                drop()
                back()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
