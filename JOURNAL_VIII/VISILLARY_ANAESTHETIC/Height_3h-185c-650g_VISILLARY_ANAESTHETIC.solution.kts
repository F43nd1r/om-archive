
solution {
    puzzle = "P102"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -22 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -23 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -16 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -16 to -2
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -15 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -1 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -4 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -6 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = -9 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -11 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -8 to 0
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -7 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -14 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -18 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -19 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -17 to 0
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = -4 to -1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -15 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -19 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -12 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -8 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0)
    }
    track {
        position = -24 to -3
        positions = listOf(1 to 3, 2 to 3, 3 to 3, 4 to 2, 3 to 2, 3 to 1, 2 to 1)
    }
    track {
        position = -14 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 2, 0 to 1, 0 to 0, 1 to 0, 2 to 0, 2 to 1, 2 to 2)
    }
    track {
        position = -11 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                back()
                back()
                reset()
                wait(3)
                grab()
                back()
                pivotClockwise()
                back()
                back()
                reset()
                wait(14)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(29)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                drop()
                wait(2)
                forward()
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(8)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                extend()
                back()
                back()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                retract()
                rotateClockwise()
                extend()
                back()
                reset()
                wait(6)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(13)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                extend()
                retract()
                retract()
                reset()
                wait(19)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                forward()
                extend()
                drop()
                retract()
                retract()
                grab()
                extend()
                extend()
                reset()
                wait(19)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                back()
                back()
                back()
                back()
                reset()
                wait(23)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(33)
                grab()
                forward()
                forward()
                forward()
                wait(1)
                back()
                back()
                reset()
                wait(21)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                grab()
                forward()
                forward()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(27)
                back()
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                retract()
                reset()
                wait(22)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                reset()
                wait(25)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                retract()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
                wait(28)
                repeat()
            }
        }
        )
    }
}
