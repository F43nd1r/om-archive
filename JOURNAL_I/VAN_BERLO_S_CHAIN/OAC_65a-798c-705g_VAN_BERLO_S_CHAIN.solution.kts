
solution {
    puzzle = "P055"
    name = "OVERLAP AG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 23 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 20 to 1
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 20 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 21 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 19 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 20 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 10 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 12 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 11 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 13 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 14 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 15 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 16 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 18 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 19 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 17 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 20 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 20 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 20 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 22 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 21 to 1
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(-2 to 1, -1 to 1, 0 to 1, 1 to 1, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0, 7 to 0, 8 to 0, 9 to 0, 10 to 0, 11 to 0, 12 to 0, 13 to 0, 14 to 0, 15 to 0, 16 to 0, 17 to 0, 18 to 0, 19 to 0, 20 to 0, 20 to 1, 19 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(88)
                rotateClockwise()
                wait(50)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                wait(131)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(85)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(79)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(69)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(63)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(53)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(47)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(33)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(18)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
