
solution {
    puzzle = "P071"
    name = "B CX 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 8
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to 7
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -7 to 4
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -8 to 6
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -8 to 5
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -9 to 6
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -9 to 5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -10 to 6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -10 to 5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -6 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 0 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 0 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 1 to 0
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 2 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 2 to 0
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 17
        position = 3 to 0
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 18
        position = 3 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 4 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = 4 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = 0 to -3
        rotation = 1
        size = 2
    }
    glyph(UNBONDER) {
        position = 0 to 3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -5 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 6
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -7 to 6
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to 3
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -4 to 2
        rotation = -4
    }
    glyph(UNIFICATION) {
        position = 0 to -1
        rotation = -2
    }
    glyph(UNIFICATION) {
        position = -6 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 6
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    track {
        position = 0 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -6 to 7
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 2 to -1, 2 to 0, 2 to 1, 1 to 2, 2 to 2, 2 to 3, 3 to 2, 3 to 1)
    }
    track {
        position = -6 to 1
        positions = listOf(1 to -1, 2 to -2, 1 to -2, 0 to -2, 0 to -1, -1 to 0, -2 to 0, -2 to 1, -2 to 2, -2 to 3, -1 to 3, -2 to 4, -2 to 5, -3 to 5, -3 to 4)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                extend()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                back()
                grab()
                rotateClockwise()
                extend()
                back()
                drop()
                rotateCounterClockwise()
                back()
                wait(10)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                back()
                back()
                grab()
                rotateClockwise()
                extend()
                back()
                drop()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                back()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(7)
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(5)
                grab()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(17) {
                wait(8)
                back()
                grab()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                rotateClockwise()
                back()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(11)
                back()
                back()
                grab()
                rotateCounterClockwise()
                extend()
                back()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(20) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(21) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                back()
                wait(6)
                forward()
                forward()
                forward()
                wait(4)
                reset()
            }
        }
        )
    }
}
