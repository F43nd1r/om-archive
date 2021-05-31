
solution {
    puzzle = "w2450512232"
    name = "B CGX STARFICZ"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 9 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 8 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to 1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -3 to 3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = -2 to 0
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = -3 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = -2 to -1
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = 2 to -1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 12
        position = 3 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 2 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 7 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = 6 to 3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 5 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 2
        rotation = 4
    }
    glyph(DISPOSAL) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
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
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 2
        rotation = -15
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -2
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 2, 0 to 1, -1 to 1, -1 to 2, -1 to 3)
    }
    track {
        position = 9 to -3
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = 2 to -3
        rotation = -6
    }
    conduit {
        id = 100
        position = 6 to 2
        rotation = -24
    }
    conduit {
        id = 101
        position = -3 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 7 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(13)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                grab()
                retract()
                drop()
                grab()
                wait(1)
                drop()
                extend()
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
            }
        }
        , 
        {
            sequence(12) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                retract()
                back()
                wait(7)
                forward()
                grab()
                extend()
                extend()
                reset()
                wait(1)
                retract()
                back()
                wait(6)
                forward()
                grab()
                extend()
                extend()
                reset()
                wait(1)
                retract()
                back()
                wait(6)
                forward()
                grab()
                extend()
                extend()
                reset()
                wait(1)
                retract()
                back()
                wait(6)
                forward()
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                retract()
                back()
                wait(7)
                forward()
                grab()
                extend()
                extend()
                drop()
                back()
                wait(3)
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                forward()
                wait(2)
                grab()
                forward()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(16)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(7)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                forward()
                rotateClockwise()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(19)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                reset()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                wait(8)
                forward()
                rotateClockwise()
                wait(1)
                grab()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                wait(3)
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                wait(3)
                drop()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                back()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                extend()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                extend()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                reset()
                wait(9)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(12)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(19)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(11)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(26)
                rotateCounterClockwise()
                reset()
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(29)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(7)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(9)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                forward()
                wait(3)
                forward()
                wait(4)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(1)
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
