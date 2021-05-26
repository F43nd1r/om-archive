
solution {
    puzzle = "P029"
    name = "OVERLAP AX"
    arm(PISTON) {
        number = 1
        position = 3 to -1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -7 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -9 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -2
        rotation = 0
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -2 to -1, -2 to -2)
    }
    track {
        position = -2 to -5
        positions = listOf(1 to 5, 0 to 5, -1 to 5, -1 to 4, -1 to 3)
    }
    track {
        position = 0 to -1
        positions = listOf(3 to -1, 3 to 0, 2 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(11)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(8)
                grab()
                pivotClockwise()
                wait(119)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                extend()
                grab()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                back()
                back()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                grab()
                pivotClockwise()
                wait(52)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
                wait(5)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
                wait(5)
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                reset()
                wait(5)
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                extend()
                drop()
                retract()
                rotateClockwise()
                back()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                back()
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
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
                forward()
                grab()
                back()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                wait(1)
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
