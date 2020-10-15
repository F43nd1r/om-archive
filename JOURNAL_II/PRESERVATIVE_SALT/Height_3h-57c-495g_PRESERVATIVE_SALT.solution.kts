
solution {
    puzzle = "P060"
    name = "H3 8T"
    arm(PISTON) {
        number = 1
        position = -14 to 0
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -16 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -10 to -2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -15 to -1
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = 0 to -2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 0 to -1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -4 to -2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -5 to -2
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -7 to -2
        rotation = -6
    }
    glyph(BONDER) {
        position = -8 to 0
        rotation = -6
    }
    glyph(BONDER) {
        position = -7 to -1
        rotation = -6
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -13 to -1
        rotation = -9
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -15 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -17 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -12 to -1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    track {
        position = -11 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 1, -1 to 1, -1 to 0, 0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = -6 to -1
        positions = listOf(1 to -1, 1 to 0, 2 to 0, 2 to -1)
    }
    track {
        position = -15 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                wait(12)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(6)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                retract()
                back()
                drop()
                retract()
                wait(3)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                back()
                grab()
                retract()
                back()
                drop()
                retract()
                wait(3)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                back()
                grab()
                retract()
                back()
                drop()
                retract()
                wait(3)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                reset()
                wait(17)
                grab()
                retract()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(5)
                grab()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                back()
                drop()
                extend()
                wait(12)
                grab()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                wait(7)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(36)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                wait(24)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                back()
                wait(1)
                back()
                wait(1)
                reset()
                wait(32)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                wait(24)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(36)
                back()
                grab()
                back()
                drop()
                back()
                wait(25)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(10)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                back()
                grab()
                retract()
                back()
                drop()
                retract()
                wait(3)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                back()
                grab()
                retract()
                back()
                drop()
                retract()
                wait(3)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                back()
                grab()
                retract()
                back()
                reset()
                wait(35)
                back()
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                wait(18)
                retract()
                retract()
                grab()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                extend()
                wait(1)
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                retract()
                back()
                wait(1)
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                retract()
                wait(1)
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                retract()
                reset()
                wait(30)
                grab()
                extend()
                wait(1)
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                wait(21)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                back()
                grab()
                forward()
                extend()
                drop()
                retract()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(13)
                back()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                forward()
                extend()
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
                pivotCounterClockwise()
                drop()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(11)
                rotateCounterClockwise()
                wait(56)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                grab()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                retract()
                wait(1)
                back()
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                retract()
                back()
                wait(1)
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                back()
                wait(51)
                retract()
                retract()
                back()
                grab()
                extend()
                wait(1)
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
