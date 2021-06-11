
solution {
    puzzle = "P072"
    name = "B CI145"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to 0
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 4
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -5 to 3
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -4 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -6 to 4
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -4 to 5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 8
        position = 3 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 0 to 0
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 10
        position = 0 to -2
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -5 to 4
        rotation = -1
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
    glyph(EQUILIBRIUM) {
        position = 1 to -4
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
        position = -6 to 5
        positions = listOf(2 to -3, 1 to -2)
    }
    track {
        position = 1 to -1
        positions = listOf(2 to -1, 1 to -1, 1 to 0, 1 to 1, 0 to 1, -1 to 2, -1 to 1, 0 to 0, 0 to -1, -1 to -1, 0 to -2, 1 to -2, 2 to -3)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 2 to 0)
    }
    track {
        position = -5 to 6
        positions = listOf(0 to 0, -1 to 0, -1 to -1, -1 to -2, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(9)
                forward()
                grab()
                back()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(8)
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
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
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
                drop()
                extend()
                wait(12)
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(5)
                back()
                grab()
                back()
                back()
                drop()
                wait(13)
                back()
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
            sequence(2) {
                wait(2)
                grab()
                forward()
                drop()
                forward()
                wait(1)
                grab()
                forward()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                wait(5)
                forward()
                pivotClockwise()
                forward()
                reset()
                wait(9)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                forward()
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
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                forward()
                forward()
                wait(7)
                rotateClockwise()
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
            sequence(5) {
                wait(20)
                grab()
                back()
                back()
                back()
                drop()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(21)
                back()
                grab()
                forward()
                drop()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
                back()
                grab()
                forward()
                forward()
                forward()
                wait(1)
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
            }
        }
        )
    }
}
