
solution {
    puzzle = "P033"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -11 to -1
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -13 to 1
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -10 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -9 to -1
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -7 to 0
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -8 to 1
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -5 to 1
        rotation = -8
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -4 to 1
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -3 to 1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -2 to 0
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -1 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -6
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -6 to 1
        rotation = -8
    }
    glyph(PURIFICATION) {
        position = -10 to 1
        rotation = -7
    }
    glyph(PURIFICATION) {
        position = -12 to 1
        rotation = -7
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -12 to 0
        rotation = 0
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -4 to -1
        positions = listOf(1 to 2, 1 to 1, 0 to 1, -1 to 2, 0 to 2)
    }
    track {
        position = -1 to 2
        positions = listOf(2 to -1, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(15)
                back()
                grab()
                forward()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(14)
                grab()
                back()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                back()
                extend()
                extend()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(12)
                grab()
                back()
                back()
                extend()
                drop()
                retract()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                wait(3)
                grab()
                pivotCounterClockwise()
                back()
                wait(2)
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                wait(2)
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
