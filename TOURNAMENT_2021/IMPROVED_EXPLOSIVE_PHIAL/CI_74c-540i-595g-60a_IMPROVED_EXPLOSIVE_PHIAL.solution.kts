
solution {
    puzzle = "w2450508212"
    name = "H2 6T"
    arm(PISTON) {
        number = 1
        position = -8 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -1 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -13 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = -16 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -19 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -23 to 1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -12 to 0
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -16 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -22 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
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
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -20 to 0
        rotation = 3
    }
    track {
        position = -2 to 1
        positions = listOf(2 to 0, 1 to 0, 0 to 0, 1 to -1)
    }
    track {
        position = -9 to 1
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to -1)
    }
    track {
        position = -13 to 0
        positions = listOf(-1 to 1, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -16 to 0
        positions = listOf(-9 to 0, -8 to 0, -7 to 0, -7 to 1, -6 to 1, -5 to 1, -4 to 1, -3 to 1, -2 to 1, -1 to 0, 0 to 0)
    }
    track {
        position = 3 to 1
        positions = listOf(1 to 0, 0 to 0, 0 to -1)
    }
    track {
        position = -4 to 1
        positions = listOf(1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                retract()
                back()
                back()
                drop()
                extend()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(35)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                back()
                retract()
                retract()
                back()
                drop()
                back()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                grab()
                retract()
                retract()
                back()
                back()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
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
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(21)
                grab()
                back()
                back()
                back()
                forward()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                back()
                back()
                back()
                forward()
                drop()
                back()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                retract()
                drop()
                extend()
                forward()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                back()
                retract()
                drop()
                extend()
                wait(1)
                reset()
                wait(3)
                grab()
                back()
                wait(20)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                retract()
                retract()
                back()
                wait(22)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(14)
                grab()
                back()
                back()
                drop()
                wait(2)
                forward()
                wait(2)
                reset()
                wait(2)
                grab()
                back()
                back()
                drop()
                wait(43)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(17)
                grab()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                back()
                back()
                back()
                drop()
                wait(5)
                back()
                back()
                back()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                extend()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                rotateCounterClockwise()
                extend()
                extend()
                wait(3)
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                wait(17)
                grab()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(9)
                grab()
                retract()
                retract()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                retract()
                drop()
                retract()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(22)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                back()
                back()
                wait(21)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
