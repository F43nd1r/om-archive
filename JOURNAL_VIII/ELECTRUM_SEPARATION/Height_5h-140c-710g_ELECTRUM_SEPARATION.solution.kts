
solution {
    puzzle = "P103"
    name = "H5 6T"
    arm(PISTON) {
        number = 1
        position = -9 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -9 to 3
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -7 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -6 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -3 to 3
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 0 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to 2
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = 1 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = 0 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -1 to -1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -8 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -11 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -12 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -10 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -9 to 0
        rotation = -1
    }
    track {
        position = 7 to 0
        positions = listOf(-3 to 0, -4 to 0, -5 to 0, -5 to -1, -6 to -1, -7 to -1, -8 to -1)
    }
    track {
        position = 4 to 2
        positions = listOf(-1 to 0, -2 to 0, -3 to 0, -4 to 1, -5 to 1, -6 to 1, -7 to 1)
    }
    track {
        position = -4 to 3
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 1 to -2, 0 to -2, -1 to -2, -2 to -2, -3 to -2, -4 to -2, -5 to -2, -5 to -1, -5 to 0, -4 to 0, -3 to 0, -2 to 0, -1 to 0)
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                retract()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(3)
                back()
                wait(10)
                grab()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                back()
                grab()
                retract()
                retract()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(3)
                back()
                wait(10)
                grab()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                back()
                grab()
                retract()
                retract()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(3)
                reset()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(15)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(17)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(21)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                forward()
                reset()
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                forward()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                reset()
                wait(9)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                extend()
                grab()
                retract()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                reset()
                wait(17)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                extend()
                reset()
                wait(11)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                grab()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                drop()
                retract()
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                extend()
                retract()
                wait(1)
                extend()
                drop()
                retract()
                retract()
                wait(4)
                grab()
                extend()
                wait(1)
                extend()
                drop()
                retract()
                retract()
                wait(4)
                grab()
                extend()
                wait(1)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(19)
                grab()
                back()
                rotateClockwise()
                back()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                wait(1)
                reset()
                wait(8)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(16)
                grab()
                rotateClockwise()
                drop()
                wait(13)
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(135)
                grab()
                rotateClockwise()
                back()
                back()
                back()
                forward()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(19)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(13)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                extend()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(23)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
                wait(17)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(19)
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(19)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(6)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                retract()
                wait(1)
                back()
                back()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                extend()
                drop()
                back()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
