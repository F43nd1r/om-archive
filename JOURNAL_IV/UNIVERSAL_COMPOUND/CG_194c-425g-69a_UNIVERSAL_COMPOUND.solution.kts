
solution {
    puzzle = "P072"
    name = "B CGX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 0 to 0
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -2 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 2
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 2 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(2 to -1, 1 to -1, 1 to 0, 0 to 1, -1 to 2, -1 to 1, 0 to 0, 0 to -1, -1 to -1, 0 to -2, 1 to -2, 2 to -3)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
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
                drop()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                extend()
                back()
                reset()
                wait(2)
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
            sequence(4) {
                wait(4)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                wait(4)
                back()
                back()
                reset()
                grab()
                forward()
                forward()
                forward()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                back()
                grab()
                back()
                back()
                drop()
                wait(8)
                forward()
                forward()
                grab()
                forward()
                drop()
                back()
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
                drop()
                forward()
                wait(5)
                grab()
                forward()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                wait(1)
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(16)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                back()
                back()
                drop()
                back()
                wait(9)
                grab()
                forward()
                drop()
                forward()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                back()
                back()
                wait(2)
                forward()
                forward()
                rotateClockwise()
                forward()
                wait(1)
                rotateClockwise()
                back()
                drop()
                wait(4)
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                retract()
                drop()
                back()
                back()
                wait(10)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                forward()
                grab()
                back()
                back()
                drop()
                back()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                back()
                wait(2)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
