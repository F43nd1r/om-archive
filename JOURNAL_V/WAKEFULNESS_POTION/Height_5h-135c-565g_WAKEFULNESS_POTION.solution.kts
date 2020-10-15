
solution {
    puzzle = "P088"
    name = "H5 6T"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to 4
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -3 to 4
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -4 to 4
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -7 to 4
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = -5 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -12 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -8 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = -9 to 3
        rotation = 5
    }
    glyph(BONDER) {
        position = -8 to 4
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
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
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
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
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
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
    glyph(EQUILIBRIUM) {
        position = 4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -11 to 2
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -3 to 2
        rotation = 6
    }
    track {
        position = -4 to 0
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to 0)
    }
    track {
        position = -5 to 4
        positions = listOf(-2 to -1, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0)
    }
    track {
        position = -2 to 3
        positions = listOf(5 to -3, 4 to -3, 3 to -3, 2 to -2, 1 to -2, 1 to -1, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -14 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
                wait(2)
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
                back()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                extend()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                retract()
                forward()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                forward()
                back()
                back()
                extend()
                reset()
                wait(3)
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
            sequence(7) {
                wait(5)
                grab()
                retract()
                back()
                extend()
                back()
                wait(4)
                extend()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
                wait(3)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                grab()
                retract()
                back()
                extend()
                back()
                wait(4)
                extend()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                back()
                drop()
                retract()
                wait(1)
                forward()
                wait(2)
                forward()
                grab()
                back()
                extend()
                extend()
                reset()
                wait(3)
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
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                back()
                drop()
                retract()
                wait(1)
                forward()
                wait(2)
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                drop()
                back()
                grab()
                retract()
                extend()
                wait(1)
                reset()
                wait(5)
                grab()
                forward()
                forward()
                drop()
                wait(1)
                reset()
                wait(1)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                forward()
                wait(28)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                back()
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                forward()
                reset()
                wait(10)
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
            sequence(5) {
                wait(9)
                grab()
                back()
                back()
                drop()
                forward()
                wait(2)
                reset()
                wait(14)
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
            sequence(3) {
                wait(5)
                back()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
                wait(3)
                reset()
                wait(10)
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
            sequence(1) {
                wait(7)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                reset()
                wait(6)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
                wait(7)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                reset()
                wait(8)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(11)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(15)
                grab()
                forward()
                reset()
                wait(15)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                grab()
                back()
                back()
                reset()
                wait(18)
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
            sequence(11) {
                wait(131)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
