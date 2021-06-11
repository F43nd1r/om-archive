
solution {
    puzzle = "P059"
    name = "B CI155 2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -14 to 1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -20 to 4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -20 to 6
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -19 to 5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -21 to 6
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -17 to 3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -18 to 3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -10 to 7
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = -10 to 1
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 10
        position = -10 to 2
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 11
        position = -7 to 0
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 12
        position = -6 to -1
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 13
        position = 2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 14
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = 3 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 1 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = 1 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = -3 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 4 to -6
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 20
        position = -1 to -1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 21
        position = 5 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 5 to -1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 23
        position = 1 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 24
        position = -2 to -5
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -14 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = -18 to 7
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -18 to 6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -8 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to 6
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -14 to 6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to 4
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -15 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -11 to 5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -9 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -7 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -9 to 5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -13 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -13 to 2
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = -13 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -21 to 8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    track {
        position = -11 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -18 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -21 to 7
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -20 to 6
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -3 to -4
        positions = listOf(1 to 0, 2 to 0, 2 to 1, 2 to 2, 2 to 3, 1 to 3)
    }
    track {
        position = 4 to -7
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 0 to -6
        positions = listOf(0 to -3, 0 to -2, 0 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 5 to -4
        positions = listOf(-3 to -4, -3 to -5, -4 to -5, -4 to -4, -4 to -3, -3 to -3, -2 to -3, -1 to -4, 0 to -5, 0 to -4, 0 to -3, 0 to -2, 0 to -1, 0 to 0, 0 to 1, 0 to 2, 0 to 3)
    }
    tape {
        parallel(
        {
            sequence(13) {
                wait(14)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                extendTape()
            }
        }
        , 
        {
            sequence(24) {
                wait(16)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(15) {
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(14) {
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(23) {
                wait(18)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(4)
                grab()
                back()
                back()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                forward()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(12)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(21) {
                wait(5)
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(22) {
                wait(10)
                grab()
                back()
                back()
                back()
                back()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(20) {
                wait(2)
                grab()
                back()
                back()
                rotateClockwise()
                back()
                retract()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(17) {
                wait(8)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(18) {
                wait(12)
                grab()
                back()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                forward()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(13)
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
            }
        }
        )
    }
}
