
solution {
    puzzle = "P059"
    name = "H5 2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -11 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -14 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -14 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -10 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -9 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -5 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -6 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -5 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = -4 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -3 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = 0 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -5 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -2 to 2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = -1 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = -4
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -10 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -10 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -11 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -10 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 2
        position = -4 to 2
        rotation = 0
    }
    track {
        position = -12 to -2
        positions = listOf(-2 to 1, -1 to 1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -12 to 2
        positions = listOf(1 to 0, 2 to 0, 3 to 0)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -13 to 0
        positions = listOf(1 to 0, 2 to 0)
    }
    track {
        position = -3 to -2
        positions = listOf(-1 to 1, 0 to 1, 1 to 1, 2 to 0, 1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -3 to 1, -2 to 1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -1 to 2
        positions = listOf(4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                back()
                drop()
                back()
                back()
                back()
                grab()
                back()
                back()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                grab()
                back()
                back()
                reset()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                back()
                wait(3)
                grab()
                rotateCounterClockwise()
                wait(1)
                forward()
                reset()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                back()
                forward()
                back()
                forward()
                rotateCounterClockwise()
                reset()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(5)
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                back()
                back()
                pivotClockwise()
                rotateClockwise()
                retract()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                wait(7)
                back()
                back()
                back()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                wait(2)
                back()
                wait(2)
                back()
                wait(4)
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                back()
                grab()
                retract()
                pivotClockwise()
                back()
                rotateClockwise()
                pivotClockwise()
                extend()
                back()
                back()
                retract()
                drop()
                wait(4)
                back()
                back()
                back()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                wait(2)
                back()
                wait(2)
                back()
                wait(4)
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                back()
                wait(2)
                back()
                wait(2)
                back()
                wait(3)
                back()
                wait(5)
                back()
                grab()
                retract()
                pivotClockwise()
                back()
                rotateClockwise()
                pivotClockwise()
                extend()
                back()
                back()
                retract()
                drop()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(9)
                back()
                wait(1)
                back()
                wait(2)
                back()
                wait(1)
                grab()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                back()
                back()
                back()
                grab()
                retract()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                wait(2)
                back()
                back()
                rotateClockwise()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                back()
                back()
                back()
                grab()
                retract()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                wait(2)
                back()
                back()
                rotateClockwise()
                wait(1)
                back()
                drop()
                retract()
                rotateClockwise()
                back()
                back()
                back()
                wait(1)
                back()
                wait(2)
                back()
                wait(1)
                grab()
                extend()
                extend()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                back()
                wait(2)
                back()
                wait(2)
                back()
                wait(3)
                back()
                wait(3)
                grab()
                back()
                back()
                pivotClockwise()
                rotateClockwise()
                retract()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(9)
                forward()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                grab()
                forward()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                rotateClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(20)
                forward()
                grab()
                back()
                back()
                back()
                back()
                back()
                reset()
                wait(11)
                repeat()
            }
        }
        )
    }
}
