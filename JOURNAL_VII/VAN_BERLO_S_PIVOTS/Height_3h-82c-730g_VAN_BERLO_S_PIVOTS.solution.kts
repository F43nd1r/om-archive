
solution {
    puzzle = "P096"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -9 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -4 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -3 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -2
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -12 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -17 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -18 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 12
        position = -18 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 13
        position = -20 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 14
        position = -22 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -22 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = -22 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -17 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -19 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -7 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -16 to 0
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -19 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -15 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -24 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -25 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -23 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -21 to -1
        rotation = -4
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -1
        rotation = 4
    }
    io(OUTPUT) {
        index = 2
        position = -8 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 3
        position = -14 to -1
        rotation = 3
    }
    track {
        position = -17 to -1
        positions = listOf(-5 to 1, -4 to 1, -3 to 1, -2 to 1, -1 to 0, -1 to -1, 0 to -1, 1 to -1, 2 to -1, 3 to -1, 4 to -1, 5 to -1)
    }
    track {
        position = -3 to 0
        positions = listOf(4 to -2, 5 to -2, 5 to -1, 4 to -1, 3 to -1, 2 to 0, 1 to 0, 0 to 0, -1 to 0, -1 to -1, 0 to -2, -1 to -2, -2 to -2, -3 to -2, -4 to -2, -5 to -2, -6 to -2)
    }
    track {
        position = -17 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -24 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(15)
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                rotateCounterClockwise()
                back()
                reset()
                wait(5)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                drop()
                extend()
                back()
                rotateClockwise()
                back()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                back()
                grab()
                retract()
                retract()
                wait(1)
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                back()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                forward()
                reset()
                wait(5)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                pivotClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                wait(3)
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                pivotClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                wait(9)
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(17)
                grab()
                pivotCounterClockwise()
                back()
                back()
                pivotClockwise()
                drop()
                wait(3)
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                pivotCounterClockwise()
                back()
                back()
                pivotClockwise()
                drop()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                extend()
                wait(1)
                reset()
                wait(4)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                extend()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(22)
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                forward()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                forward()
                wait(18)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(10)
                grab()
                retract()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                extend()
                wait(1)
                reset()
                wait(4)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                retract()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                back()
                grab()
                retract()
                retract()
                wait(1)
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                back()
                grab()
                retract()
                retract()
                wait(3)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(19)
                forward()
                grab()
                retract()
                rotateClockwise()
                back()
                reset()
                wait(7)
                repeat()
                wait(12)
                repeat()
                wait(12)
                forward()
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(8)
                forward()
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                forward()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                forward()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                forward()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                forward()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                forward()
                reset()
                wait(5)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(26)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                extend()
                wait(5)
                grab()
                back()
                forward()
                retract()
                retract()
                wait(4)
                back()
                back()
                wait(1)
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                retract()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
