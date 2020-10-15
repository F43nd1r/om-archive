
solution {
    puzzle = "P072"
    name = "B CA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -2
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -3 to 2
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -2 to 2
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -3
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 1 to -3
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = 0 to -4
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = -3 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -2 to -4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 0
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = -1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 8
    }
    track {
        position = -2 to -5
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 3 to -4
        positions = listOf(-2 to -1, -3 to 0, -2 to 0, -2 to 1, -1 to 0, -1 to 1, -2 to 2, -3 to 3, -3 to 2)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(7)
                grab()
                forward()
                pivotClockwise()
                back()
                retract()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                extend()
                pivotClockwise()
                retract()
                back()
                wait(1)
                extend()
                pivotClockwise()
                forward()
                retract()
                drop()
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
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
                retract()
                reset()
                wait(19)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(16)
                extendTape()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                back()
                drop()
                back()
                wait(5)
                grab()
                back()
                retract()
                reset()
                wait(4)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                wait(13)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(9)
                extend()
                back()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                reset()
                grab()
                retract()
                rotateClockwise()
                wait(1)
                retract()
                pivotCounterClockwise()
                drop()
                back()
                wait(8)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                retract()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                forward()
                grab()
                back()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                wait(7)
                back()
                back()
                wait(2)
                reset()
            }
        }
        )
    }
}
