
solution {
    puzzle = "P043"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = -5 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to -6
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -7 to 4
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -7 to 3
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 10
        position = 2 to -5
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 11
        position = -8 to 2
        rotation = 0
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 12
        position = 5 to 0
        rotation = 5
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 13
        position = 7 to -3
        rotation = 6
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 14
        position = 3 to 3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -5 to 5
        rotation = -2
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 5 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 3 to 2
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 2 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -4 to -2
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = -2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -4 to -3
        rotation = 0
    }
    track {
        position = 7 to -3
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to -1, 0 to -2, 1 to -3, 1 to -2)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 1 to -6
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -8 to 7
        positions = listOf(0 to -3, 1 to -4, 1 to -3, 1 to -2)
    }
    track {
        position = -7 to 1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
        
            }
        }
        , 
        {
            sequence(12) {
        
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                forward()
                forward()
                back()
                wait(1)
                forward()
                back()
                wait(1)
                forward()
                back()
                wait(1)
                forward()
                back()
                wait(1)
                forward()
                back()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                forward()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                wait(13)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                forward()
                grab()
                pivotCounterClockwise()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                wait(3)
                forward()
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                retract()
                retract()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
